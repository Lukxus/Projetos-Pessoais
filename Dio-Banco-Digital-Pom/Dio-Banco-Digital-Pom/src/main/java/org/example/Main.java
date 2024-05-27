package org.example;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.example.vo.Conta;

import java.util.List;

import static org.example.utils.ConfigReader.getXmlFilePath;
import static org.example.utils.FileUtils.lerConteudoDoArquivo;
import static org.example.utils.LeArquivoXml.extrairContasDoXML;
import static org.example.utils.LeArquivoXml.readDocumento;

public class Main {

    public static void main(String[] args) throws DocumentException {


        String filePath = getXmlFilePath();
        String conteudo = lerConteudoDoArquivo(filePath);
        Document documento = readDocumento(conteudo);
        List<? extends Conta> contas = extrairContasDoXML(documento);
        System.out.println(contas);

    }

}