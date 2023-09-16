package com.emendes.feature;

/**
 * Interface que contém as abstrações da funcionalidade do MusicPlayer.
 */
public interface MusicPlayer {

  /**
   * Reproduz a música selecionada.
   */
  void play();

  /**
   * Pausa a música que estiver tocando no momento.
   */
  void pause();

  /**
   * Seleciona uma música para reproduzir.
   */
  void selectMusic();

}
