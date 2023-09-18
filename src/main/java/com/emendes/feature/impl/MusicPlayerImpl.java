package com.emendes.feature.impl;

import com.emendes.feature.MusicPlayer;

/**
 * Implementação de {@link MusicPlayer}.
 */
public class MusicPlayerImpl implements MusicPlayer {

  @Override
  public void play() {
    System.out.println("Tocando música!");
  }

  @Override
  public void pause() {
    System.out.println("Pausando música!");
  }

  @Override
  public void selectMusic() {
    System.out.println("Selecionando música!");
  }

}
