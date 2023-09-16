package com.emendes.feature;

/**
 * Interface que contém as abstrações da funcionalidade do Browser.
 */
public interface Browser {

  /**
   * Mostra a página do navegador.
   */
  void showPage();

  /**
   * Adiciona uma nova aba.
   */
  void addNewTab();

  /**
   * Recarrega a página atual.
   */
  void reloadPage();

}
