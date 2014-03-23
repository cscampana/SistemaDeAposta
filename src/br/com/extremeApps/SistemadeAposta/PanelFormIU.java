/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.extremeApps.SistemadeAposta;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JComponent;
import javax.swing.JPanel;
import javax.swing.plaf.basic.BasicPanelUI;

/**
 *
 * @author SirExtreme
 */
public class PanelFormIU extends BasicPanelUI {
    
    private final Color corInicial = new Color(255, 255, 0);
    private final Color corFinal = new Color(142, 229, 238);

    @Override
    protected void installDefaults(JPanel panel) {
        panel.setOpaque(true);
    }

    @Override
    public void paint(Graphics g, JComponent c) {
        Graphics2D g2 = (Graphics2D) g;

        Dimension vSize = c.getSize();

        int h = vSize.height;
        int w = vSize.width;

        g2.fillRect(0, 0, w, h);

        g2.setPaint(new GradientPaint(0, 0, corInicial, 0, h, corFinal));
        g2.fillRect(3, 0, w - 4, h - 2);

    }
}
