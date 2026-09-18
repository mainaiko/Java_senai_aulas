package aulasOitoMain;

import java.io.File;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;

public class AlgoritmoTrintaeOito extends Animal {
    public AlgoritmoTrintaeOito(String nome, String tocarSom) {
        super(nome, tocarSom);
    }

    @Override
    public void tocarSom() {
        try {
            File arquivo = new File("javaprojetos/src/aulasOitoMain/porco.wav");

            AudioInputStream audio = AudioSystem.getAudioInputStream(arquivo);

            Clip clip = AudioSystem.getClip();
            clip.open(audio);

            IO.println("Porco grunhindo...");

            clip.start();

            Thread.sleep(clip.getMicrosecondLength() / 1000);

            clip.close();
            audio.close();

        } catch (Exception e) {
            IO.println("Erro ao reproduzir áudio: " + e);
        }
    }
    @Override
    public void comer() {
        IO.println("O porco está comendo.");
    }
}
