package gui;

import champions.Set2.Team;
import combinations.filter.SynergieFilter;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class MainGui {

    JFrame jFrame;

    public MainGui(){

        jFrame = new JFrame("TFT");

        initViewElements(jFrame);

        jFrame.setSize(800,600);
        jFrame.setLayout(null);
        jFrame.setVisible(true);

    }

    //initinitViewElements [JFrame] -> [JFrame]
    public void initViewElements(JFrame jFrame){
        JTextField iChampion=new JTextField();
        iChampion.setBounds(50,50, 150,30);
        jFrame.add(iChampion);

        JLabel result = new JLabel("Here will be the Result");
        result.setBounds(50,100,250,100);
        jFrame.add(result);

        JButton b=new JButton("Click Here");
        b.setBounds(200,50,95,30);
        jFrame.add(b);


        final int[] counter = {55};
        SynergieFilter synergieFilter = new SynergieFilter();
        ArrayList<Team> team = synergieFilter.getTeamWithSpecificChampion_String("Nautilus");
        System.out.println(team.get(335).toString());
        b.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                counter[0]++;
                System.out.println(counter[0]);
                result.setText(team.get(counter[0]).toString());
            }
        });

        //Champion Analyser Section
        JLabel titleAnalyser = new JLabel("Champion Analyser Section");
        titleAnalyser.setBounds(150,250,250,100);
        jFrame.add(titleAnalyser);

        JTextField iAmountOfChampions=new JTextField();
        iAmountOfChampions.setBounds(120,330, 100,30);
        jFrame.add(iAmountOfChampions);

        JButton bStart=new JButton("Start");
        bStart.setBounds(270,330,80,40);
        jFrame.add(bStart);

        JButton bStop=new JButton("Stop");
        bStop.setBounds(350,330,80,40);
        jFrame.add(bStop);

        JLabel lAnalyserResult = new JLabel("Here will be the Result");
        lAnalyserResult.setBounds(50,100,250,100);
        jFrame.add(lAnalyserResult);


    }

}
