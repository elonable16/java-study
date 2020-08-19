package hello2;
import javax.sound.sampled.*;
import javax.swing.*;
import java.awt.*;
import java.io.*;

public class LineEventEX extends JFrame {
	private Clip clip;
	private String song = "audio/애국가1절.wav";
	private JLabel label = new JLabel(song);
	
	public LineEventEX() {
		setTitle("애국가 1절");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		c.setBackground(Color.YELLOW);
		c.add(label);
		setSize(300,150);
		setVisible(true);
		loadAudio(song);
	}
	
	private void loadAudio(String pathname) {
		try {
			File audioFile = new File(pathname);
			final AudioInputStream audioStream = AudioSystem.getAudioInputStream(audioFile);
			
			clip = AudioSystem.getClip();
			clip.addLineListener(new LineListener(){
				public void update(LineEvent e) {
					if(e.getType() == LineEvent.Type.STOP) {
						try {
							getContentPane().setBackground(Color.ORANGE);
							label.setText(song +"연주 끝");
							audioStream.close();
						} catch (IOException e1) {
							e1.printStackTrace();
						}
					}
				}
			});
			
			clip.open(audioStream);
			clip.start();
			}
			catch (LineUnavailableException e) {e.printStackTrace();}
			catch (UnsupportedAudioFileException e) {e.printStackTrace();}
			catch (IOException e) {e.printStackTrace();}
		}

	public static void main(String[] args) {
		new LineEventEX();
	}

}
