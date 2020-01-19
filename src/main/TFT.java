package main;


import champions.Set2.Synergies_SET2;
import champions.Set2.Team;
import combinations.filter.SynergieFilter;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.*;

public class TFT {
    public static void main(String[] args) {
        SynergieFilter synergieFilter = new SynergieFilter();
        ArrayList<Team> team = synergieFilter.getTeamWithSpecificChampion_String("Nautilus");
        System.out.println(team.get(335).toString());


        JFrame f=new JFrame("TFT");

        JTextField tf=new JTextField();
        tf.setBounds(50,50, 150,30);

        JLabel result = new JLabel("Here will be the Result");
        result.setBounds(50,100,750,450);

        JButton b=new JButton("Click Here");
        b.setBounds(200,50,95,30);
        b.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                result.setText(team.get(335).toString());
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

