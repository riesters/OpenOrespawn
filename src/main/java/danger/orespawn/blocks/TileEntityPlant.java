package danger.orespawn.blocks;

import net.minecraft.tileentity.*;
import danger.orespawn.*;
import net.minecraft.nbt.*;

public class TileEntityPlant extends TileEntity
{
    private int age;
    private int phase;
    private int heightContribution;
    
    public TileEntityPlant() {
        this.age = 0;
        this.phase = 1;
        this.heightContribution = OreSpawnMain.OreSpawnRand.nextInt(5) + 3;
    }
    
    public int getAge() {
        return this.age;
    }
    
    public void setAge(final int x) {
        this.age = x;
    }
    
    public int getPhase() {
        return this.phase;
    }
    
    public void setPhase(final int x) {
        this.phase = x;
    }
    
    public int getHeightContribution() {
        return this.heightContribution;
    }
    
    public void readFromNBT(final NBTTagCompound nbt) {
        this.age = nbt.getInteger("Age");
        this.phase = nbt.getInteger("Phase");
        this.heightContribution = nbt.getInteger("HeightContribution");
        super.readFromNBT(nbt);
    }
    
    public NBTTagCompound writeToNBT(final NBTTagCompound nbt) {
        nbt.setInteger("Age", this.age);
        nbt.setInteger("Phase", this.phase);
        nbt.setInteger("HeightContribution", this.heightContribution);
        return super.writeToNBT(nbt);
    }
}
