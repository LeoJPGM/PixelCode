package com.example.application.views.principal;

import pagina.base.PaginaBase;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.html.Span;
import com.vaadin.flow.component.orderedlayout.FlexComponent;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;


@PageTitle("Fundamentos Lenguaje C")
@Route(value = "fundamentos-c")
public class FundamentosC extends PaginaBase{
    public FundamentosC() {
        PaginaFC();
    }

    public void PaginaFC(){

        VerticalLayout contenedorPrincipal = new VerticalLayout();
        HorizontalLayout contenedorColor = new HorizontalLayout();
        VerticalLayout contenedorTittle = new VerticalLayout();
        VerticalLayout contenedorContenido = new VerticalLayout();


        //Primer Contenedor (Solo color)
        VerticalLayout contenedor1 = new VerticalLayout();
        contenedor1.getStyle().set("background-color", "#57dbff");
        contenedorColor.add(contenedor1);
        contenedorColor.setWidthFull();

        //Contenedor de titulo
        Span info = new Span("Fundamentos del lenguaje en C");
        info.getStyle().set("color", "black");
        info.getStyle().set("font-weight", "bold");
        info.getStyle().set("font-size", "28px");

        contenedorTittle.add(info);
        contenedorTittle.setAlignItems(FlexComponent.Alignment.CENTER);

        //Contenedor Contenido inicial
        VerticalLayout contenedorIntroduction = new VerticalLayout();
        Span info2 = new Span("¡Bienvenido a la sección de Introducción a la programación en C! En esta sesión, exploraremos los fundamentos del lenguaje C, la estructura básica de un programa en C y el proceso de compilación y ejecución de programas en C. Vamos a sumergirnos en los conceptos clave para que puedas obtener una base sólida en la programación.");

        contenedorIntroduction.add(info2);
        contenedorIntroduction.getStyle().set("background-color", "#dae1f0");
        contenedorIntroduction.setWidth("100%");

        //contenedor fundam
        VerticalLayout contenedorFund = new VerticalLayout();

        Span info3 = new Span("Introduccion al Lenguaje en C");
        info3.getStyle().set("font-size", "24px");
        info3.getStyle().set("color", "black");
        info3.getStyle().set("font-weight", "bold");

        Span info4 = new Span("Comencemos con los fundamentos del lenguaje C. C es un lenguaje de programación de propósito general que se utiliza ampliamente en el desarrollo de software. Es conocido por su eficiencia, flexibilidad y capacidad para realizar operaciones de bajo nivel. Para comenzar a programar en C, es importante comprender su sintaxis y estructura.");

        contenedorFund.add(info3, info4);
        contenedorFund.getStyle().set("background-color", "#dae1f0");
        contenedorFund.setWidth("100%");

        // estructura de un programa
        VerticalLayout contenedorestructura = new VerticalLayout();

        Span info5 = new Span("Estructura básica de un programa en C");
        info5.getStyle().set("font-size", "24px");
        info5.getStyle().set("color", "black");
        info5.getStyle().set("font-weight", "bold");

        Span info6 = new Span("La estructura básica de un programa en C consta de varias secciones. La primera sección es la declaración de bibliotecas, donde se incluyen las bibliotecas estándar necesarias para utilizar diferentes funciones y características en C. Luego viene la función principal, llamada \"main\", que es el punto de entrada del programa. Dentro de la función main, escribiremos el código que se ejecutará.\n" +
                "\n" +
                "En C, utilizamos declaraciones de variables para almacenar y manipular datos. Una variable es un espacio en la memoria donde podemos almacenar un valor. Antes de utilizar una variable, debemos declararla especificando su tipo y nombre. Por ejemplo, podemos declarar una variable entera llamada \"edad\" para almacenar la edad de una persona.\n" +
                "\n" +
                "Además de las variables, en C utilizamos diferentes tipos de datos, como enteros, flotantes, caracteres y booleanos, para representar diferentes tipos de información. Cada tipo de dato tiene un rango de valores y se utiliza de manera adecuada según las necesidades del programa.");

        contenedorIntroduction.add(info5, info6);
        contenedorIntroduction.getStyle().set("background-color", "#dae1f0");
        contenedorIntroduction.setWidth("100%");

        // Compilacion y ejecucion
        VerticalLayout contenedorcompilacion = new VerticalLayout();

        Span info7 = new Span("Estructura básica de un programa en C");
        info7.getStyle().set("font-size", "24px");
        info7.getStyle().set("color", "black");
        info7.getStyle().set("font-weight", "bold");

        Span info8 = new Span(" La compilación es el proceso de traducir el código fuente escrito en lenguaje C a un lenguaje de bajo nivel que la máquina pueda entender y ejecutar. El código fuente es el programa que has escrito utilizando la sintaxis y las reglas del lenguaje C.\n" +
                "\n" +
                "Para llevar a cabo la compilación de un programa en C, necesitamos un compilador específico para este lenguaje. Un compilador es una herramienta que toma el código fuente escrito en C y lo traduce a un código de máquina que pueda ser ejecutado por el procesador de la computadora. Uno de los compiladores más utilizados para C es el GCC (GNU Compiler Collection).\n" +
                "\n" +
                "El proceso de compilación consta de varias etapas. En la etapa de preprocesamiento, se realizan diferentes tareas, como la inclusión de archivos de cabecera y la expansión de macros. Luego, en la etapa de compilación, el código fuente se traduce a un código objeto, que contiene instrucciones en lenguaje ensamblador específicas de la arquitectura de la computadora. A continuación, en la etapa de enlace, los diferentes módulos de código objeto se combinan para formar un ejecutable final. Durante este proceso, se realizan varias verificaciones y optimizaciones para garantizar la correcta ejecución del programa.\n" +
                "\n" +
                "Una vez que el programa ha sido compilado con éxito, obtenemos un archivo ejecutable. Este archivo contiene las instrucciones de bajo nivel que la máquina puede interpretar y ejecutar. Para ejecutar el programa, simplemente debemos hacer doble clic en el archivo ejecutable o ejecutarlo desde la línea de comandos.\n" +
                "\n" +
                "Durante la ejecución del programa, el procesador interpreta las instrucciones del archivo ejecutable y realiza las operaciones especificadas en el código fuente. El programa puede interactuar con el usuario a través de la entrada y la salida, realizar cálculos, acceder a archivos y realizar otras tareas según lo haya sido programado.\n" +
                "\n" +
                "Es importante destacar que durante el proceso de compilación y ejecución, pueden surgir errores. Los errores de compilación ocurren cuando el compilador encuentra un problema en el código fuente, como una sintaxis incorrecta o una referencia a una variable no declarada. Estos errores deben corregirse antes de que el programa pueda ser ejecutado correctamente. Por otro lado, los errores de ejecución pueden ocurrir cuando el programa se está ejecutando y se encuentra con una situación inesperada, como una división por cero o una falta de memoria.");

        contenedorIntroduction.add(info7, info8);
        contenedorIntroduction.getStyle().set("background-color", "#dae1f0");
        contenedorIntroduction.setWidth("100%");

        Button empezar2 = new Button("Empezar aquí", buttonClickEvent -> {getUI().ifPresent(ui -> {ui.navigate("variables-c");});});
        Button empezar3 = new Button("Regresar", buttonClickEvent -> {getUI().ifPresent(ui -> {ui.navigate("lenguaje-c");});});
        contenedorContenido.add(contenedorIntroduction,contenedorFund,contenedorestructura,contenedorcompilacion);
        contenedorPrincipal.add(contenedorColor,contenedorTittle,contenedorContenido,empezar3, empezar2);
        setContent(contenedorPrincipal);

    }


}