package br.com.fiap.winery;

import jakarta.jws.WebService;

@WebService(endpointInterface = "br.com.fiap.winery.WineStockService")
public class WineStockServiceImplementation implements WineStockService{

    @Override
    public String getMenu() {
        return """
            --- MENU DE VINHOS ---
            
            Vinhos Tintos:
            - Cabernet Sauvignon
            - Merlot
            - Pinot Noir
            - Malbec
            - Syrah
            
            Vinhos Brancos:
            - Chardonnay
            - Sauvignon Blanc
            - Riesling
            - Moscato
            
            Vinhos Rosés:
            - Pinot Noir Rosé
            - Syrah Rosé
            - Grenache Rosé
            """;
    }

    @Override
    public String placeOrder(String name, int quantity) {
        return "Pedido confirmado!";
    }
}
