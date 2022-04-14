package com.softuni.basics;

import java.util.Scanner;

public class ProjectsCreation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String architectName = sc.nextLine();
        int projectsCount = Integer.parseInt(sc.nextLine());
        int hoursToCompleteProjects = projectsCount * 3;

        System.out.printf("The architect %s will need %d hours to complete %d project/s.%n", architectName, hoursToCompleteProjects, projectsCount);
    }
}