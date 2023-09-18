package com.emendes.feature.impl;

import com.emendes.feature.Phone;

/**
 * Implementação de {@link Phone}.
 */
public class PhoneImpl implements Phone {

  @Override
  public void call(String phoneNumber) {
    System.out.printf("Ligando para %s!%n", phoneNumber);
  }

  @Override
  public void answer() {
    System.out.println("Atendendo ligação!");
  }

  @Override
  public void startVoiceMail() {
    System.out.println("Iniciando correio de voz!");
  }

}
