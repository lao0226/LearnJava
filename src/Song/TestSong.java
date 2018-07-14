package Song;

public class TestSong {

	public static void main(String args[]) {
		Song s1=new Song("Royals", "Lorde");
		Song s2=new Song("Lollipop","Mika");
		Song s3=new Song("Hey Jude", "Glee Cast");
		Song s4=new Song("Hey Jude", "John Lennon");
		
		Song top=max(max(s1,s2),max(s3,s4));
		System.out.println("Top 1\n"+top.returnSongAndSinger());
	}
	
	private static Song max(Song song1, Song song2) {
		if(song1.compareTo(song2)>0) {
			return song1;
		}
		else {
			return song2;
		}
	}

	
}
