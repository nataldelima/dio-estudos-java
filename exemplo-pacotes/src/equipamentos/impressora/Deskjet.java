package equipamentos.impressora;

import equipamentos.digitalizadora.Digitalizadora;

public class Deskjet implements Impressora {

    @Override
    public void imprimir() {
        System.out.println("IMPRIMINDO DESKJET");
    }
}
