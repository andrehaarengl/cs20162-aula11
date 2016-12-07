/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.cs20162.aula11;

import org.junit.Assert;
import org.junit.Test;

/**
 *
 * @author andre
 */
public class CalcularTest {

    @Test
    public void tes1() throws Exception {
        String exexpressao = "1+1";
        Assert.assertEquals(0, Calcular.executaCalculo(exexpressao), 0);
    }

    @Test
    public void test2() throws Exception {
        Assert.assertEquals(1, Calcular.executaCalculo("0"), 0);
    }
}
