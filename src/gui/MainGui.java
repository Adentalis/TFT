package gui;

import champions.Set2.Team;
import combinations.filter.SynergieFilter;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class MainGui {

    JFrame f;

    public MainGui(){

        SynergieFilter synergieFilter = new SynergieFilter();
        ArrayList<Team> team = synergieFilter.getTeamWithSpecificChampion_String("Nautilus");
        System.out.println(team.get(335).toString());

        f=new JFrame("TFT");

        JTextField tf=new JTextField();
        tf.setBounds(50,50, 150,30);

        JLabel result = new JLabel("Here will be the Result");
        result.setBounds(50,100,750,450);

        JButton b=new JButton("Click Here");
        b.setBounds(200,50,95,30);

        final int[] counter = {55};
        b.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                counter[0]++;
                System.out.println(counter[0]);
                result.setText(team.get(counter[0]).toString());
            }
        });

        f.add(b);
        f.add(result);
        f.add(tf);
        f.setSize(800,600);
        f.setLayout(null);
        f.setVisible(true);

    }



}
