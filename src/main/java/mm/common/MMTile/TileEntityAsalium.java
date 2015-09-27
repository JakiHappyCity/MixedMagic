package mm.common.MMTile;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.IInventory;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.nbt.NBTTagList;
import net.minecraft.network.NetworkManager;
import net.minecraft.network.Packet;
import net.minecraft.network.play.server.S35PacketUpdateTileEntity;
import net.minecraft.tileentity.TileEntity;

public class TileEntityAsalium extends TileEntity implements IInventory {

    public int size;
    public ItemStack[] itemStacks;

    public void setSize(int size) {
        this.size = size;
        itemStacks = new ItemStack[size];
    }
    
    @Override
    public Packet getDescriptionPacket() {
        NBTTagCompound syncData = new NBTTagCompound();
        writeSyncData(syncData);
        return new S35PacketUpdateTileEntity(this.xCoord, this.yCoord, this.zCoord, 1, syncData);
    }

    @Override
    public int getSizeInventory() {
        return size;
    }

    @Override
    public ItemStack getStackInSlot(int p_70301_1_) {
        return itemStacks[p_70301_1_];
    }

    public void clearInventory() {
        for (int i = 0; i < getSizeInventory(); i++) {
            setInventorySlotContents(i, null);
            worldObj.markBlockForUpdate(xCoord, yCoord, zCoord);
            markDirty();
        }
    }

    @Override
    public ItemStack decrStackSize(int p_70298_1_, int p_70298_2_) {
        ItemStack stack = this.getStackInSlot(p_70298_1_);
        if (stack != null) {
            if (stack.stackSize <= p_70298_2_) {
                setInventorySlotContents(p_70298_1_, (ItemStack) null);
            } else {
                stack = stack.splitStack(p_70298_2_);
                if (stack.stackSize == 0) {
                    setInventorySlotContents(p_70298_1_, (ItemStack) null);
                }
            }
        }
        worldObj.markBlockForUpdate(xCoord, yCoord, zCoord);
        return stack;
    }

    @Override
    public ItemStack getStackInSlotOnClosing(int p_70304_1_) {
        if (itemStacks[p_70304_1_] != null) {
            ItemStack itemstack = itemStacks[p_70304_1_];
            itemStacks[p_70304_1_] = null;
            return itemstack;
        } else {
            return null;
        }
    }

    @Override
    public void readFromNBT(NBTTagCompound p_145839_1_) {
        super.readFromNBT(p_145839_1_);
        readSyncData(p_145839_1_);
    }

    @Override
    public void setInventorySlotContents(int p_70299_1_, ItemStack p_70299_2_) {
        itemStacks[p_70299_1_] = p_70299_2_;
        if (p_70299_2_ != null && p_70299_2_.stackSize > this.getInventoryStackLimit()) {
            p_70299_2_.stackSize = getInventoryStackLimit();
        }
        worldObj.markBlockForUpdate(xCoord, yCoord, zCoord);
    }

    @Override
    public String getInventoryName() {
        return "Storage";
    }

    @Override
    public boolean hasCustomInventoryName() {
        return false;
    }

    @Override
    public int getInventoryStackLimit() {
        return 64;
    }

    @Override
    public boolean isUseableByPlayer(EntityPlayer p_70300_1_) {
        return !p_70300_1_.isDead;
    }

    @Override
    public void openInventory() {
    }

    @Override
    public void closeInventory() {
    }

    @Override
    public boolean isItemValidForSlot(int p_94041_1_, ItemStack p_94041_2_) {
        return false;
    }

    public void writeSyncData(NBTTagCompound nbt) {
        NBTTagList nbttaglist = new NBTTagList();
        for (int i = 0; i < getSizeInventory(); ++i) {
            if (itemStacks[i] != null) {
                NBTTagCompound nbttagcompound1 = new NBTTagCompound();
                nbttagcompound1.setByte("Slot", (byte) i);
                itemStacks[i].writeToNBT(nbttagcompound1);
                nbttaglist.appendTag(nbttagcompound1);
            }
        }
        nbt.setTag("Items", nbttaglist);
        nbt.setInteger("Size", size);
    }

    public void readSyncData(NBTTagCompound nbt) {
        size = nbt.getInteger("Size");
        setSize(size);
        NBTTagList nbttaglist = nbt.getTagList("Items", 10);
        for (int i = 0; i < nbttaglist.tagCount(); ++i) {
            NBTTagCompound nbttagcompound1 = nbttaglist.getCompoundTagAt(i);
            byte b0 = nbttagcompound1.getByte("Slot");
            if (b0 >= 0 && b0 < itemStacks.length) {
                itemStacks[b0] = ItemStack.loadItemStackFromNBT(nbttagcompound1);
            }
        }
    }

    @Override
    public void onDataPacket(NetworkManager net, S35PacketUpdateTileEntity pkt) {
        readSyncData(pkt.func_148857_g());
    }

    @Override
    public void writeToNBT(NBTTagCompound nbt) {
        super.writeToNBT(nbt);
        writeSyncData(nbt);
    }
}
