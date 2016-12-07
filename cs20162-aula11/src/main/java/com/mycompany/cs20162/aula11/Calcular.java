/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.cs20162.aula11;

import com.github.kyriosdata.parser.Lexer;
import com.github.kyriosdata.parser.Parser;

/**
 *
 * @author andre
 */
public class Calcular {

    public static float resultadoFinal;

    /**
     *
     * @param expressao
     * @return
     */
    public static int executaCalculo(String expressao) {
        try {
            Lexer meuLexer = new Lexer(expressao);
            Parser meuPaser = new Parser(meuLexer.tokenize());
            resultadoFinal = meuPaser.expressao().valor();

            return 0;
        } catch (Exception ex) {
            return 1;
        }
    }

}
