package com.emendes.app;

import com.emendes.feature.Browser;
import com.emendes.feature.MusicPlayer;
import com.emendes.feature.Phone;

/**
 * Classe que representa o IPhone.
 */
public class IPhone {

  private final Browser browser;
  private final MusicPlayer musicPlayer;
  private final Phone phone;

  public IPhone(Browser browser, MusicPlayer musicPlayer, Phone phone) {
    this.browser = browser;
    this.musicPlayer = musicPlayer;
    this.phone = phone;
  }

  /**
   * Ligar o IPhone.
   */
  public void turnOn() {
    System.out.println("Ligando IPhone!");
  }

  /**
   * Desligar o IPhone.
   */
  public void turnOff() {
    System.out.println("Desligando IPhone!");
  }

  public Browser getBrowser() {
    return browser;
  }

  public MusicPlayer getMusicPlayer() {
    return musicPlayer;
  }

  public Phone getPhone() {
    return phone;
  }

}
