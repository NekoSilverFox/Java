/**
 * -*- coding: utf-8 -*-
 * Шифрование с использованием отображения
 *
 * @Time : 2023/9/20 15:13
 * @Author : NekoSilverfox
 * @FileName: Main
 * @Software: IntelliJ IDEA
 * @Versions: v0.1
 * @Github ：https://github.com/NekoSilverFox
 */

package org.bigdata;

import org.jdom2.Document;
import org.jdom2.Element;
import org.jdom2.input.SAXBuilder;
import org.jdom2.output.Format;
import org.jdom2.output.XMLOutputter;

import javax.xml.XMLConstants;
import java.io.*;
import java.util.List;
import java.nio.file.Files;
import java.nio.file.Path;

import static org.bigdata.Config.OBFUSCATED_FILEPATH;
import static org.bigdata.Config.UNOBFUSCATED_FILEPATH;
import static org.bigdata.Config.SOURCE_FILEPATH;
import static org.bigdata.Config.XML_ELEMENT;

public class Main {
    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Obfuscate please input `o`, Deobfuscate input `d`: ");
        char mode = (char) br.read();

        /* обфускирования */
        if ('o' == mode) {
            System.out.println(">> Obfuscate");

            if (Files.notExists(Path.of(SOURCE_FILEPATH))) {
                System.out.printf("Source XML " + SOURCE_FILEPATH + " file not found");
                return;
            }

            /* Read XML */
            SAXBuilder saxBuilder = new SAXBuilder();
            saxBuilder.setProperty(XMLConstants.ACCESS_EXTERNAL_DTD, "");
            saxBuilder.setProperty(XMLConstants.ACCESS_EXTERNAL_SCHEMA, "");

            Document doc = saxBuilder.build(new File(SOURCE_FILEPATH));
            Element root = doc.getRootElement();
            List<Element> list = root.getChildren("employee");

            for (Element e : list) {
                for (int i = 0; i < XML_ELEMENT.length; i++) {
                    String eStr = e.getChildText(XML_ELEMENT[i]);
                    String obfuscatedValue = Encrypt.obfuscate(eStr);
                    e.getChild(XML_ELEMENT[i]).setText(obfuscatedValue);
                }
            }

            /* Save XML */
            FileWriter fileWriter = new FileWriter(OBFUSCATED_FILEPATH);

            XMLOutputter xmlOutputter = new XMLOutputter();
            xmlOutputter.setFormat(Format.getPrettyFormat().setEncoding("ISO-8859-1"));
            xmlOutputter.output(doc, fileWriter);



            /* де-обфускация */
        } else if ('d' == mode) {
            System.out.println("<< Deobfuscate");

            if (Files.notExists(Path.of(OBFUSCATED_FILEPATH))) {
                System.out.printf("Obfuscated file " + OBFUSCATED_FILEPATH + " not found");
                return;
            }

            /* Read XML */
            SAXBuilder saxBuilder = new SAXBuilder();
            saxBuilder.setProperty(XMLConstants.ACCESS_EXTERNAL_DTD, "");
            saxBuilder.setProperty(XMLConstants.ACCESS_EXTERNAL_SCHEMA, "");

            Document doc = saxBuilder.build(new File(OBFUSCATED_FILEPATH));
            Element root = doc.getRootElement();
            List<Element> list = root.getChildren("employee");

            /* Encoding for every element */
            for (Element e : list) {
                for (int i = 0; i < XML_ELEMENT.length; i++) {
                    String eStr = e.getChildText(XML_ELEMENT[i]);
                    String deobfuscatedValue = Encrypt.unobfuscate(eStr);
                    e.getChild(XML_ELEMENT[i]).setText(deobfuscatedValue);
                }
            }

            /* Save XML */
            FileWriter fw = new FileWriter(UNOBFUSCATED_FILEPATH);
            XMLOutputter xmlOutputter = new XMLOutputter();
            xmlOutputter.setFormat(Format.getPrettyFormat().setEncoding("ISO-8859-1"));
            xmlOutputter.output(doc, fw);

        } else {
            System.out.println("[ERROR] Arguments" + mode + "not found, please input `o` or `d`");
        }
    }
}