package com.emendes.feature.impl;

import com.emendes.feature.Browser;

/**
 * Implementação de {@link Browser}.
 */
public class BrowserImpl implements Browser {

  @Override
  public void showPage() {
    System.out.println("Mostrando Página");
  }

  @Override
  public void addNewTab() {
    System.out.println("Adicionando nova aba!");
  }

  @Override
  public void reloadPage() {
    System.out.println("Recarregando página!");
  }

}
