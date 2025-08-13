package main;

import javax.sound.sampled.*;
import java.io.*;

// SoundEffects class for handling chess sound effects
class SoundEffects {
    private Clip moveSound;
    private Clip captureSound;

    public SoundEffects() {
        try {
            // Load sound files
            File moveSoundFile = new File("path/to/move_sound.wav");
            AudioInputStream moveSoundStream = AudioSystem.getAudioInputStream(moveSoundFile);
            moveSound = AudioSystem.getClip();
            moveSound.open(moveSoundStream);

            File captureSoundFile = new File("path/to/capture_sound.wav");
            AudioInputStream captureSoundStream = AudioSystem.getAudioInputStream(captureSoundFile);
            captureSound = AudioSystem.getClip();
            captureSound.open(captureSoundStream);
        } catch (UnsupportedAudioFileException | IOException | LineUnavailableException e) {
            e.printStackTrace();
        }
    }

    public void playMoveSound() {
        if (moveSound.isRunning())
            moveSound.stop();
        moveSound.setFramePosition(0); // Rewind to the beginning
        moveSound.start();
    }

    public void playCaptureSound() {
        if (captureSound.isRunning())
            captureSound.stop();
        captureSound.setFramePosition(0); // Rewind to the beginning
        captureSound.start();
    }
}
