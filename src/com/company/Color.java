package com.company;

public enum Color {

        ANSI_RESET("\u001B[0m"),
        BLACK("\u001B[30m"),
        RED("\u001B[31m"),
        GREEN("\u001B[32m"),
        YELLOW("\u001B[33m"),
        BLUE("\u001B[34m"),
        PURPLE("\u001B[35m"),
        CYAN("\u001B[36m"),
        WHITE("\u001B[37m");

        private String color;

        Color(String color) {
                this.color = color;
        }

        public String getColor() {
                return color;
        }

        static int getRandomColor(){
                int min = 1;
                int max = 8;
                max -= min;
                int Avg = (int)(Math.random() * max) + min;
                return Avg;

        }

        }


