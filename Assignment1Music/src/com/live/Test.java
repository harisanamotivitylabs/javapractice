package com.live;
import com.music.in.*;
import com.music.string.*;
import com.music.wind.*;

class MusicType
{
	Playable getInstrument(String instrument)
	{
		if(instrument.equals("Veena"))
			return new Veena();
		else if(instrument.equals("Saxophone"))
			return new Saxophone();
		else
			return null;
	}
}

public class Test {

	public static void main(String[] args) {
		
		MusicType type=new MusicType();
		Playable play=type.getInstrument("Veena");
		play.play();
	}

}
