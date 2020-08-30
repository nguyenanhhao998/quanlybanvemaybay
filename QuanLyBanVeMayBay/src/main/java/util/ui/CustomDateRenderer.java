/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util.ui;

import java.awt.BorderLayout;
import java.awt.Component;
import java.text.SimpleDateFormat;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTable;
import static javax.swing.SwingConstants.CENTER;
import javax.swing.table.TableCellRenderer;

/**
 *
 * @author HAO
 */
public class CustomDateRenderer extends JPanel implements TableCellRenderer {

    private SimpleDateFormat SDF = new SimpleDateFormat("dd-MM-yyyy");
    JLabel label;

    public CustomDateRenderer() {
        setLayout(new BorderLayout());

        label = new JLabel();
        label.setFont(new java.awt.Font("Tahoma", 0, 16));
        label.setHorizontalAlignment(CENTER);

        add(label, BorderLayout.CENTER);
    }

    public CustomDateRenderer(SimpleDateFormat sdf) {
        this.SDF = sdf;
        setLayout(new BorderLayout());

        label = new JLabel();
        label.setFont(new java.awt.Font("Tahoma", 0, 16));
        label.setHorizontalAlignment(CENTER);

        add(label, BorderLayout.CENTER);
    }

    @Override
    public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
        label.setText(SDF.format(value));
        return this;
    }


}
