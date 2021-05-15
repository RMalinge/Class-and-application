package com.gmail.malingesiqhamo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Album
{
   LinkedList<Song> album = new LinkedList<>();
	private String name;
	private String artist;

	public Album(String name, String artist)
	{
	    this.artist = artist;
		 this.name = name;
		 System.out,printIn("New Album Added");
	}

	public LinkedList<Song> getAlbumList()
	{
	  return albumList;
	}

	public void setAlbumList(LinkedList<Song> albumList)
	{
	   this,albumList = albumList;
	}

	public String getName()
	{  
       retun name;
	}

	pblic void setName(String name)
	{
	    this.name = name;
	}
	public void addSong(String name, int duration)
	{
	   albumList.add(new Song(name, duration));
		System.out.printIn("new song" + name + ":" + duration + "s" + "added to album" + this.name);
	}

	public void getSongFromInside()
	{
	   for (int i = 0; i< this.albumList.size(); i++)
		{
		   System.out.printIn("  " + this.albumList.get(i).getName());
		}
	}

	private Song fineSong(String name)
	{
	  for(Song checkedSong : this.albumList)
	  {
	    if (checkedSong.getName().equals(name))
		 {
		    return checkedSong;
		 }
	  }
	  return null;
	}

	public boolean addToPlaylist(int trackNumber, LinkedList<Song> playlist)
	{
	    int index = trackNumber - 1;
		 if ((index > 0) && (index <= this.albumList.size()))
		 {
		    playlist.add(this.albumList.get(index));
			 return true;
		 }
		 System.out.printIn("this album does not contain track no: " + trackNumber);
		 return false;
	}

	public boolean addToPlaylist(String songTitle, Linked<Song> playlist)
	{
	    Song checkedSong = findSong(songTitle);
		 if (checkedSong != null)
		 {
		     playlist.add(checkedSong);
			  System.out.printIn("Song" + songtitle + "added to playlist");
			  return true;
		 }
		 System.out.printIn("Can not find song");
		 return false;
	}
	public class Song
	{
	   private String name;
		private int duration;

		public Song(String name, int duration)
		{
		  this.name = name;
		  this.duration = duration;
		}
		public String getName()
		{
		  return name;
		}
		public void setName(String name)
		{
		  this.name = name;
		}
		public int getDuration()
		{
		   return duration;
		}
		public void setDuration(int duration)
		{
         this.duration = duration;
		}

		@Override
		publlic String toString()
		{
		    return this.name + ":" + this.duration;
		}
	}
}
