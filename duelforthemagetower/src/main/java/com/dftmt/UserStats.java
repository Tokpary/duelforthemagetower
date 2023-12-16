package com.dftmt;

public class UserStats
{
	private final int id;
	private int stat1;
	private int stat2;
	
	public UserStats(int id)
	{
		this.id = id;
		stat1 = 0;
		stat2 = 0;
	}
	
	public int getId() { return id; }
	public int getStat1() { return stat1; }
	public int getStat2() { return stat2; }
	
	public void increaseStat1(int amount)
	{
		stat1 += amount;
	}
	
	public void increaseStat2(int amount)
	{
		stat2 += amount;
	}
}
