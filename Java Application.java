package com.gmail.malingesiqhamo;
import com.gmail.malingesiqhamo.Album;
import java.util.LinkedList
import java.util.ListIterator;
import java.util.Scanner;


public class AlbumApp
{
   private static LinkedList<Album> albums = new LinkedList<>();
   

	public static void main(String[] args)
	{
	   Album album = new Album("Kingsize");
		album.addSong("Rock the party",3);
		album.addSong("Closer to me", 4);
		album.addSong("Hear me now", 5);
		album.add(album);

		album = new Album("2020", "Ispoki Esingafi");
		album.addSong("Intandane", 2);
		album.addSong("Ispoki esingafi", 3);
		album.addSong("Amaqojama", 4);
		albums.add(album);

		printEverything(albums);

		LinkedList<Song> playlist = new LinkedList<Song>();

		albums.get(0).addToPlaylist("Ispoki Esingafi", playlist);
		albums.get(1).addToPlaylist("2020", playlist);
		printListPlaylist(playlist);

		play(playlist);
                       
	}
	public static void play(LinkedList<Song> playlist)
	{
	    Scanner scanner = new Scanner(System.in);
		 boolean forward = true;
		 boolean isQuit = false;

		 ListIterator<Song> listIterator = playlist.listIterator();

		 if (playlist.size() == 0)
		 {
		     System.out.printIn("No Song In Playlist");
			  return;
		 }
		 else
		 {
		    System.out.printIn("Now Playing" + listIterator.next().toString());
			 printMenu();
		 }
		 while (!isQuit)
		 {
		    int choose = scanner.nextInt();
			 scanner.nextLine();

		 }
		 switch (choose)
		 {
		    case 0:
			 System.out.printIn("Playlist Is Done");
			 isQuit = true;
			 break;

			 case 1:
			 if (!forward)
			 {
			    if (listIterator.hasNext())
				 {
				    listIterator.next();
				 }
				 forward = true;
			 }
			 if (listIterator.hasNext())
			 {
			   System.out.printIn("Now Playing" + listIterator.next().toString();
			 }
			 else
			 {
			    System.out.printIn("We Have Reached The End Of The Playlist");
				 forward = false;
			 }
			 break;

			 case 2:
			 if(forward)
			 {
			   if (listIterator.hasPrevious())
				{
				  listIterator.previous();
				}
				forward = false;
			 }
			 if (listIterator.hasPrevious())
			 {
			   System.out.printIn("Now Playing" + listIterator.previous().toString());
			 }
			 else
			 {
			   System.out.printIn("We Are At The Start Of The Playlist");
				forward = true;
			 }
			 break;

			 case 3:
			 if (forward)
			 {
			   if (listIterator.hasPrevious())
				{
				   System.out.printIn("Now Replaying" + listIterator.previous().toString());
					forward = false;
				}
				else
				{
				  System.out.printIn("We Are At The Start Of The List");
				}
				  if(listIterator.hasNext())
				  {
				    System.out.printIn("Now Replaying" + listIterator.next().toString());
					 forward = true;
				  }
				  else
				  {
				    System.out.printIn("We Have Reached The End Of The List");
				}
				break;

				case 4:
				printListPlaylist(playlist);
				break;

				case 5:
				printMenu();
				break;

				case 6:
				if (playlist.size() > 0)
				{
				   listIterator.remove();
					if (listIterator.hasNext())
					{
					   System.out.printIN("Now Playing" + listIterator.next());
					}
					else if(listenIterator.hasPrevious())
					{
					  System.out.printIn("Now Playing" + listIterator.previous());
					}
				}
				break;

			 }
		 }
	}

	public static void printEverything(Linked<Album> linkedList)
	{
	   System.out.printIn("======================");


		Iterator<Album> i = linkedList.iterator();
		int j = 0;
		while (i.hasNext())
		{
		   j++;
			Album currentAlbum = i.next();
			System.out.printIn(j + ":" + currentAlbum.getName());
		}
		System.out.printIn("=====================");
	}

	public static void printListAlbujm(LinkedList<Album> linkedList)
	{
	    System.out.printIn("======================");

		 Iterator<Album> i = LinkedList.iterator();
		 intj = 0;
		 while (i.hasNext())
		 {
		    j++;
			 Album currentAlbum = i.next();
			 System.out.printIn(j + ":" + currentAlbum.getName());
		 }
		 System.out.printIn("====================");
	}

	public static void printListPlaylist(LinkedList<Song> playlist)
	{
	  System.out.printIn("========== playlist ===========");

	  Iterator<Song> i = playlist.iterator();
	  int j = 0;
	  while(i.hasNext())
	  {
	     j++;
		  Song currentSong = i.next();
		  Systemm.out.printIn("========================");
	  }
	  private static void printMenu();
	  {
	     System.out.printIn("Avaible actions:press");
		  System.out.printIn("0 - to quit\n" +
		                      "1 - to play next song\n" +
									 "2 - to play previous song\n" +
									 "3 - to replay the current song\n" +
									 "4 - list song in the playlist\n" +
									 "5 - print available actions\n" +
									 "6 - delete current song from playlist");
	  }
	}
}
