package org.example.utils;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;
import org.example.vo.Cliente;
import org.example.vo.Conta;
import org.example.vo.ContaCorrente;
import org.example.vo.ContaInvestimento;
import org.example.vo.ContaPoupanca;
import org.example.vo.TipoContaEnum;

import java.io.StringReader;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class LeArquivoXml {

    public static org.dom4j.Document readDocumento(String xml) throws DocumentException {
        SAXReader reader = new SAXReader();
        return reader.read(new StringReader(xml));
    }

    public static List<? extends Conta> extrairContasDoXML(Document documento) {
        List<Conta> contas = new ArrayList<>();
        Element root = documento.getRootElement();
        List<Element> elementosConta = root.elements("account");
        for (Element elementoConta : elementosConta) {
            Cliente cliente = new Cliente();
            cliente.setNome(elementoConta.elementText("holderName"));
            int agencia = Integer.parseInt(elementoConta.elementText("agency"));
            int numero = Integer.parseInt(elementoConta.elementText("accountNumber"));
            BigDecimal saldo = new BigDecimal(elementoConta.elementText("balance"));
            String tipoStr = elementoConta.elementText("accountType");

            TipoContaEnum tipo = TipoContaEnum.fromString(tipoStr);
            if (tipo != null) {
                Conta conta;

                if (tipo.equals(TipoContaEnum.CONTA_CORRENTE)) {
                    conta = new ContaCorrente(cliente, numero, agencia);
                } else if (tipo.equals(TipoContaEnum.CONTA_POUPANCA)) {
                    conta = new ContaPoupanca(cliente, numero, agencia);
                } else { //if (tipo.equals(TipoContaEnum.CONTA_INVESTIMENTO)) {
                    conta = new ContaInvestimento(cliente, numero, agencia);
                }

                contas.add(conta);
            }

        }
        return contas;
    }
}
