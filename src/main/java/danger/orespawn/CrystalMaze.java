package danger.orespawn;

import java.awt.Point;
import java.util.Vector;
import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.world.World;
import net.minecraft.world.chunk.Chunk;

public class CrystalMaze {
  public static final int WTOP = 1;
  
  public static final int WRGT = 2;
  
  public static final int WBOT = 4;
  
  public static final int WLFT = 8;
  
  public void buildCrystalMaze(World world, int x, int y, int z, Chunk chunk) {
    for (int i = 0; i < 16; i++) {
      for (int j = 0; j < 16; j++) {
        for (int k = 0; k < 3; k++)
          OreSpawnMain.setBlockIDWithMetadataInChunk(chunk, x + j, y + k, z + i, Blocks.air, 0); 
      } 
    } 
    makeMaze(world, x, y, z, 4, 4, 4, 1, chunk);
    openCrystalMaze(world, x, y, z, 4, 4, 4, chunk);
  }
  
  private void openCrystalMaze(World world, int xx, int yy, int zz, int xw, int zw, int csz, Chunk chunk) {
    int i;
    for (i = 0; i < zw * csz; i++) {
      OreSpawnMain.setBlockIDWithMetadataInChunk(chunk, xx, yy, zz + i, Blocks.air, 0);
      OreSpawnMain.setBlockIDWithMetadataInChunk(chunk, xx, yy + 1, zz + i, Blocks.air, 0);
      OreSpawnMain.setBlockIDWithMetadataInChunk(chunk, xx, yy + 2, zz + i, Blocks.air, 0);
      OreSpawnMain.setBlockIDWithMetadataInChunk(chunk, xx + i, yy, zz, Blocks.air, 0);
      OreSpawnMain.setBlockIDWithMetadataInChunk(chunk, xx + i, yy + 1, zz, Blocks.air, 0);
      OreSpawnMain.setBlockIDWithMetadataInChunk(chunk, xx + i, yy + 2, zz, Blocks.air, 0);
      OreSpawnMain.setBlockIDWithMetadataInChunk(chunk, xx + zw * csz - 1, yy, zz + i, Blocks.air, 0);
      OreSpawnMain.setBlockIDWithMetadataInChunk(chunk, xx + zw * csz - 1, yy + 1, zz + i, Blocks.air, 0);
      OreSpawnMain.setBlockIDWithMetadataInChunk(chunk, xx + zw * csz - 1, yy + 2, zz + i, Blocks.air, 0);
      OreSpawnMain.setBlockIDWithMetadataInChunk(chunk, xx + i, yy, zz + zw * csz - 1, Blocks.air, 0);
      OreSpawnMain.setBlockIDWithMetadataInChunk(chunk, xx + i, yy + 1, zz + zw * csz - 1, Blocks.air, 0);
      OreSpawnMain.setBlockIDWithMetadataInChunk(chunk, xx + i, yy + 2, zz + zw * csz - 1, Blocks.air, 0);
    } 
    for (i = 0; i < zw * csz; i++) {
      for (int m = 0; m < zw * csz; m++) {
        OreSpawnMain.setBlockIDWithMetadataInChunk(chunk, xx + m, yy - 1, zz + i, Blocks.bedrock, 0);
        OreSpawnMain.setBlockIDWithMetadataInChunk(chunk, xx + m, yy + 3, zz + i, Blocks.bedrock, 0);
      } 
    } 
    for (int k = 0; k < 4; k++) {
      i = world.rand.nextInt(zw * csz);
      int m = world.rand.nextInt(zw * csz);
      OreSpawnMain.setBlockIDWithMetadataInChunk(chunk, xx + m, yy + 3, zz + i, OreSpawnMain.CrystalStone, 0);
    } 
    i = world.rand.nextInt(zw * csz);
    int j = world.rand.nextInt(zw * csz);
    OreSpawnMain.setBlockIDWithMetadataInChunk(chunk, xx + j, yy - 1, zz + i, OreSpawnMain.CrystalStone, 0);
  }
  
  private void makeMaze(World world, int xx, int yy, int zz, int xw, int zw, int csz, int b, Chunk chunk) {
    int gridw = xw;
    int gridh = zw;
    int cellsize = csz;
    if (cellsize < 3)
      cellsize = 3; 
    int[][] cells = new int[gridw][gridh];
    int full = 15;
    int x;
    for (x = 0; x < gridw; x++) {
      for (int i = 0; i < gridh; i++)
        cells[x][i] = full; 
    } 
    int left = 128;
    int right = 32;
    int y;
    for (y = 0; y < gridh; y++) {
      cells[0][y] = cells[0][y] | left;
      cells[gridw - 1][y] = cells[gridw - 1][y] | right;
    } 
    int top = 16;
    int bottom = 64;
    for (x = 0; x < gridw; x++) {
      cells[x][0] = cells[x][0] | top;
      cells[x][gridh - 1] = cells[x][gridh - 1] | bottom;
    } 
    Vector<Point> outlist = new Vector(gridw * gridh);
    Vector<Point> inlist = new Vector(10, 10);
    Vector frontlist = new Vector(10, 10);
    for (x = 0; x < gridw; x++) {
      for (y = 0; y < gridh; y++)
        outlist.addElement(new Point(x, y)); 
    } 
    Point current_cell = (Point)rndElement(outlist);
    inlist.addElement(current_cell);
    moveNbrs(current_cell, cells, outlist, frontlist);
    while (!frontlist.isEmpty()) {
      current_cell = (Point)rndElement(frontlist);
      inlist.addElement(current_cell);
      moveNbrs(current_cell, cells, outlist, frontlist);
      int dir = findInNbr(current_cell, cells, inlist);
      removeWall(current_cell, dir, cells);
    } 
    current_cell = null;
    for (x = 0; x < gridw; x++) {
      for (y = 0; y < gridh; y++) {
        int val = cells[x][y];
        if ((val & 0x1) != 0)
          drawSide(world, x * cellsize, y * cellsize, (x + 1) * cellsize, y * cellsize, xx, yy, zz, cellsize, gridh, gridw, b, chunk); 
        if ((val & 0x2) != 0)
          drawSide(world, (x + 1) * cellsize - 1, y * cellsize, (x + 1) * cellsize - 1, (y + 1) * cellsize, xx, yy, zz, cellsize, gridh, gridw, b, chunk); 
        if ((val & 0x4) != 0)
          drawSide(world, x * cellsize, (y + 1) * cellsize - 1, (x + 1) * cellsize, (y + 1) * cellsize - 1, xx, yy, zz, cellsize, gridh, gridw, b, chunk); 
        if ((val & 0x8) != 0)
          drawSide(world, x * cellsize, y * cellsize, x * cellsize, (y + 1) * cellsize, xx, yy, zz, cellsize, gridh, gridw, b, chunk); 
      } 
    } 
  }
  
  private void drawSide(World world, int fromx, int fromz, int tox, int toz, int x, int y, int z, int cellsize, int gridh, int gridw, int bb, Chunk chunk) {
    Block blk = Blocks.obsidian;
    if (bb != 0)
      blk = Blocks.bedrock; 
    if (fromx > tox) {
      int i = fromx;
      fromx = tox;
      tox = i;
    } 
    if (fromz > toz) {
      int i = fromz;
      fromz = toz;
      toz = i;
    } 
    if (fromx == tox) {
      int i = fromx;
      for (int j = fromz; j <= toz; j++) {
        if (j < cellsize * gridh) {
          OreSpawnMain.setBlockIDWithMetadataInChunk(chunk, i + x, y, j + z, blk, 0);
          OreSpawnMain.setBlockIDWithMetadataInChunk(chunk, i + x, y + 1, j + z, blk, 0);
          OreSpawnMain.setBlockIDWithMetadataInChunk(chunk, i + x, y + 2, j + z, blk, 0);
        } 
      } 
    } else {
      int j = fromz;
      for (int i = fromx; i <= tox; i++) {
        if (i < cellsize * gridw) {
          OreSpawnMain.setBlockIDWithMetadataInChunk(chunk, i + x, y, j + z, blk, 0);
          OreSpawnMain.setBlockIDWithMetadataInChunk(chunk, i + x, y + 1, j + z, blk, 0);
          OreSpawnMain.setBlockIDWithMetadataInChunk(chunk, i + x, y + 2, j + z, blk, 0);
        } 
      } 
    } 
  }
  
  private int findInNbr(Point p, int[][] cells, Vector inlist) {
    int d = rnd(4) - 1;
    int k = 0;
    while (k < 4) {
      switch (d) {
        case 0:
          if ((cells[p.x][p.y] & 0x10) == 0 && 
            inlist.indexOf(new Point(p.x, p.y - 1)) >= 0)
            return 1; 
          break;
        case 1:
          if ((cells[p.x][p.y] & 0x20) == 0 && 
            inlist.indexOf(new Point(p.x + 1, p.y)) >= 0)
            return 2; 
          break;
        case 2:
          if ((cells[p.x][p.y] & 0x40) == 0 && 
            inlist.indexOf(new Point(p.x, p.y + 1)) >= 0)
            return 4; 
          break;
        case 3:
          if ((cells[p.x][p.y] & 0x80) == 0 && 
            inlist.indexOf(new Point(p.x - 1, p.y)) >= 0)
            return 8; 
          break;
      } 
      d = (d + 1) % 4;
      k++;
    } 
    return 0;
  }
  
  private void moveNbrs(Point p, int[][] cells, Vector outlist, Vector frontlist) {
    if ((cells[p.x][p.y] & 0x10) == 0) {
      Point s = new Point(p.x, p.y - 1);
      movePoint(s, outlist, frontlist);
    } 
    if ((cells[p.x][p.y] & 0x20) == 0) {
      Point s = new Point(p.x + 1, p.y);
      movePoint(s, outlist, frontlist);
    } 
    if ((cells[p.x][p.y] & 0x40) == 0) {
      Point s = new Point(p.x, p.y + 1);
      movePoint(s, outlist, frontlist);
    } 
    if ((cells[p.x][p.y] & 0x80) == 0) {
      Point s = new Point(p.x - 1, p.y);
      movePoint(s, outlist, frontlist);
    } 
  }
  
  private void movePoint(Point p, Vector v, Vector<Point> w) {
    int i = v.indexOf(p);
    if (i >= 0) {
      v.removeElementAt(i);
      w.addElement(p);
    } 
  }
  
  private void removeWall(Point p, int d, int[][] cells) {
    cells[p.x][p.y] = cells[p.x][p.y] ^ d;
    switch (d) {
      case 1:
        cells[p.x][p.y - 1] = cells[p.x][p.y - 1] ^ 0x4;
        break;
      case 2:
        cells[p.x + 1][p.y] = cells[p.x + 1][p.y] ^ 0x8;
        break;
      case 4:
        cells[p.x][p.y + 1] = cells[p.x][p.y + 1] ^ 0x1;
        break;
      case 8:
        cells[p.x - 1][p.y] = cells[p.x - 1][p.y] ^ 0x2;
        break;
    } 
  }
  
  private int rnd(int n) {
    return (int)(Math.random() * n + 1.0D);
  }
  
  private Object rndElement(Vector v) {
    int i = rnd(v.size()) - 1;
    Object s = v.elementAt(i);
    v.removeElementAt(i);
    return s;
  }
  
  private void clearArea(World world, int x, int y, int z, Chunk chunk) {
    int i;
    for (i = 0; i < 60; i++) {
      int hi = 5;
      if (i >= 30)
        hi = 7; 
      for (int j = 0; j < hi; j++) {
        for (int k = 0; k < 30; k++)
          OreSpawnMain.setBlockIDWithMetadataInChunk(chunk, x + i, y + j, z + k, Blocks.air, 0); 
      } 
    } 
    for (i = 0; i < 5; i++) {
      for (int j = 0; j < 6; j++) {
        for (int k = 0; k < 30; k++)
          OreSpawnMain.setBlockIDWithMetadataInChunk(chunk, x - i, y + j, z + k, Blocks.air, 0); 
      } 
    } 
  }
}
