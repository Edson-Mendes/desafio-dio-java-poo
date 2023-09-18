package com.emendes;

import com.emendes.app.IPhone;
import com.emendes.feature.Browser;
import com.emendes.feature.MusicPlayer;
import com.emendes.feature.Phone;
import com.emendes.feature.impl.BrowserImpl;
import com.emendes.feature.impl.MusicPlayerImpl;
import com.emendes.feature.impl.PhoneImpl;

public class Main {

  public static void main(String[] args) {
    // Dependências
    Browser browser = new BrowserImpl();
    MusicPlayer musicPlayer = new MusicPlayerImpl();
    Phone phone = new PhoneImpl();

    IPhone iPhone = new IPhone(browser, musicPlayer, phone);

    // Executando funcionalidades.
    // Phone, Browser e MusicPlayer deveriam ser utilizados dentro do IPhone,
    // e não serem chamados fora da classe por terceiros.
    iPhone.getPhone().call("(99) 99999-9999");
    iPhone.getPhone().answer();
    iPhone.getPhone().startVoiceMail();
    System.out.println("-----------------------------------------");

    iPhone.getBrowser().showPage();
    iPhone.getBrowser().addNewTab();
    iPhone.getBrowser().reloadPage();
    System.out.println("-----------------------------------------");

    iPhone.getMusicPlayer().selectMusic();
    iPhone.getMusicPlayer().play();
    iPhone.getMusicPlayer().pause();
  }

}