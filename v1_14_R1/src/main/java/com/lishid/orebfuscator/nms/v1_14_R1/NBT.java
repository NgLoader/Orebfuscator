/**
 * @author lishid
 * @author Aleksey Terzi
 *
 */

package com.lishid.orebfuscator.nms.v1_14_R1;

import java.io.DataInput;
import java.io.DataInputStream;
import java.io.DataOutput;
import java.io.IOException;

import com.lishid.orebfuscator.nms.INBT;

import net.minecraft.server.v1_14_R1.NBTCompressedStreamTools;
import net.minecraft.server.v1_14_R1.NBTTagCompound;

public class NBT implements INBT {

	NBTTagCompound nbt = new NBTTagCompound();

	public void reset() {
		this.nbt = new NBTTagCompound();
	}

	public void setInt(String tag, int value) {
		this.nbt.setInt(tag, value);
	}

	public void setLong(String tag, long value) {
		this.nbt.setLong(tag, value);
	}

	public void setByteArray(String tag, byte[] value) {
		this.nbt.setByteArray(tag, value);
	}

	public void setIntArray(String tag, int[] value) {
		this.nbt.setIntArray(tag, value);
	}

	public int getInt(String tag) {
		return this.nbt.getInt(tag);
	}

	public long getLong(String tag) {
		return this.nbt.getLong(tag);
	}

	public byte[] getByteArray(String tag) {
		return this.nbt.getByteArray(tag);
	}

	public int[] getIntArray(String tag) {
		return this.nbt.getIntArray(tag);
	}

	public void Read(DataInput stream) throws IOException {
		this.nbt = NBTCompressedStreamTools.a((DataInputStream) stream);
	}

	public void Write(DataOutput stream) throws IOException {
		NBTCompressedStreamTools.a(this.nbt, stream);
	}
}
