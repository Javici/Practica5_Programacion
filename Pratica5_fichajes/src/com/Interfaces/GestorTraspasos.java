package com.Interfaces;

import com.Clases.*;
import com.Enum.*;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

public interface GestorTraspasos {
    void apobarTraspaso(Jugador Jugador, ArrayList<String> lista1, ArrayList<String> lista2);

    void rechazarTraspaso(Jugador Jugador, ArrayList<String> lista1, ArrayList<String> lista2);
}
