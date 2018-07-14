package Song;

public class Song {

	//instance variable
	private String name;
	private String singer;
	
	//constructor
	public Song(String name, String singer) {
		this.name=name;
		this.singer=singer;
	}
	
	//method
	public String getSongName() {
		return this.name;
	}
	
	public String getSingerName() {
		return this.singer;
	}
	
	public int compareTo(Song other) {
		if(this.name.equals(other.name)) {
			return this.singer.compareTo(other.singer);
		}
		else {
			return this.name.compareTo(other.name);
		}
	}
	
	public String returnSongAndSinger() {
		String line1="Song: "+name;
		String line2="Singer: "+singer;
		return line1+"\n"+line2;
	}
}
