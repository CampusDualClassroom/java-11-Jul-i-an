package com.campusdual.classroom;

public class Exercise11 {
    public static void main(String[] args) {
        TVRemote redRemote = new TVRemote("Rojo");
        TVRemote blackRemote = new TVRemote("Negro");
        System.out.println(redRemote.getColor());
        System.out.println(blackRemote.getColor());

        TVRemote miTele = new TVRemote("Amarillo");
        // Encender la TV
        miTele.turnOn();
        System.out.println(miTele.getColor() + " está " + miTele.on);

        // Subir un canal
        System.out.println("Canal actual: " + miTele.channel);
        miTele.channelUp();
        System.out.println("Canal actual: " + miTele.channel);

        // Bajar un canal
        miTele.channelDown();
        System.out.println("Canal actual: " + miTele.channel);
        // Establecer el canal en 0, intentar bajar un canal y comprobar que no se puede
        miTele.channel = 0;
        miTele.channelDown();
        System.out.println("Canal actual: " + miTele.channel);

        // Subir el volumen
        System.out.println("Volumen actual: " + miTele.volume);
        miTele.volumeUp();
        System.out.println("Volumen actual: " + miTele.volume);

        // Bajar el volumen
        miTele.volumeDown();
        System.out.println("Volumen actual: " + miTele.volume);

        // Establecer el volumen en 0, intentar bajar el volumen y comprobar que no se puede
        miTele.volume = 0;
        miTele.volumeDown();
        System.out.println("Volumen actual: " + miTele.volume);

        // Obtener el color del mando a distancia y mostrarlo por pantalla
        System.out.println("El color del mando es " + miTele.getColor());

        // Apagar la TV
        miTele.turnOff();
        System.out.println(miTele.getColor() + " está " + miTele.on);
    }


}