package com.emendes.feature;

/**
 * Interface que contém as abstrações da funcionalidade do Phone.
 */
public interface Phone {

  /**
   * Realiza uma ligação para o dado número de telefone.
   *
   * @param phoneNumber Número de telefone.
   */
  void call(String phoneNumber);

  /**
   * Atende uma ligação que está sendo recebida.
   */
  void answer();

  /**
   * Inicia o correio de voz.
   */
  void startVoiceMail();

}
