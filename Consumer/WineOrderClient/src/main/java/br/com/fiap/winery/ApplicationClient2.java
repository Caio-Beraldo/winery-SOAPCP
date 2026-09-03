package br.com.fiap.winery;

import jakarta.xml.ws.Service;

import javax.xml.namespace.QName;
import java.net.MalformedURLException;
import java.net.URL;

public class ApplicationClient2 {
    public void main(String[] args) throws MalformedURLException {
        URL url = new URL("http://localhost:8085/WineStockService?wsdl");
        URL url2 = new URL("http://localhost:8085/WineWarningService?wsdl");
        QName qName = new QName("http://winery.fiap.com.br/","WineStockServiceImplementationService");
        QName qName2 = new QName("http://winery.fiap.com.br/","WineWarningServiceImplementationService");
        Service service = Service.create(url, qName);
        Service service2 = Service.create(url2, qName2);
        WineStockService wineStockService = service.getPort(WineStockService.class);
        WineWarningService wineWarningService = service2.getPort(WineWarningService.class);
        String order = wineStockService.placeOrder("Vinho branco",2);
        System.out.println(order);
        String warn = wineWarningService.sendWarn();
        System.out.println(warn);
    }
}
