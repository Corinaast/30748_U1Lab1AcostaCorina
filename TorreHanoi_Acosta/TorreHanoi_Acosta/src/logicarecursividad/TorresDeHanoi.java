package logicarecursividad;
import interfaz.TorresDeHanoiPanel;
public class TorresDeHanoi {
    private TorresDeHanoiPanel panel;
    public TorresDeHanoi(TorresDeHanoiPanel panel) {
        this.panel = panel;
    }
    public void resolver(int numDiscos, int origen, int auxiliar, int destino, int delay) {
        if (numDiscos > 0) {
            resolver(numDiscos - 1, origen, destino, auxiliar, delay);
            panel.moverDisco(origen, destino);
            try {
                Thread.sleep(delay);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
            resolver(numDiscos - 1, auxiliar, origen, destino, delay);
        }
    }
}