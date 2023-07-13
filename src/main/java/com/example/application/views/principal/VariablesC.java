package com.example.application.views.principal;

import pagina.base.PaginaBase;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.html.Span;
import com.vaadin.flow.component.orderedlayout.FlexComponent;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;


@PageTitle("Variables y Tipos de datos en C")
@Route(value = "variables-c")


public class VariablesC extends PaginaBase{
    public VariablesC() {
        PaginaVC();
    }

    public void PaginaVC(){

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
        Span info = new Span("Variables y Tipos de datos en C");
        info.getStyle().set("color", "black");
        info.getStyle().set("font-weight", "bold");
        info.getStyle().set("font-size", "28px");

        contenedorTittle.add(info);
        contenedorTittle.setAlignItems(FlexComponent.Alignment.CENTER);

        //Contenedor Contenido inicial
        VerticalLayout contenedorIntroduction = new VerticalLayout();
        Span info2 = new Span("¡Bienvenido a la sección de Variables y Tipos de datos en C! En esta sesión, vamos a explorar los conceptos fundamentales de las variables, los tipos de datos y las operaciones aritméticas en el lenguaje de programación C. Estos conceptos son esenciales para construir programas eficientes y realizar cálculos precisos.");

        contenedorIntroduction.add(info2);
        contenedorIntroduction.getStyle().set("background-color", "#dae1f0");
        contenedorIntroduction.setWidth("100%");

        //contenedor fundam
        VerticalLayout contenedorFund = new VerticalLayout();

        Span info3 = new Span("Variables en C");
        info3.getStyle().set("font-size", "24px");
        info3.getStyle().set("color", "black");
        info3.getStyle().set("font-weight", "bold");

        Span info4 = new Span("Una variable es un contenedor que puede almacenar valores de diferentes tipos. Para utilizar una variable en C, primero debemos declararla, especificando su tipo y nombre. La declaración de una variable le indica al compilador qué cantidad de memoria reservar para almacenar el valor de la variable. Por ejemplo, podemos declarar una variable entera llamada \"edad\" de la siguiente manera:\nint edad;\n"+
                "\n" +
                "Una vez que hemos declarado una variable, podemos asignarle un valor utilizando el operador de asignación (=). Por ejemplo, podemos asignar el valor 25 a la variable \"edad\" de la siguiente manera:\n"+
                "\n" +
                "edad = 25;\n"+
                "\n" +
                "También es posible declarar y asignar una variable en la misma línea de código. Por ejemplo, podemos declarar y asignar una variable entera llamada \"cantidad\" con el valor 10 de la siguiente manera:\n"+
                "\n" +
                "int cantidad = 10;\n");

        contenedorFund.add(info3, info4);
        contenedorFund.getStyle().set("background-color", "#dae1f0");
        contenedorFund.setWidth("100%");

        // Tipos de datos
        VerticalLayout contenedordatos = new VerticalLayout();

        Span info5 = new Span("Tipos de datos en C");
        info5.getStyle().set("font-size", "24px");
        info5.getStyle().set("color", "black");
        info5.getStyle().set("font-weight", "bold");

        Span info6 = new Span("En C, existen diferentes tipos de datos básicos que podemos utilizar para declarar variables. Algunos de los tipos de datos más comunes son:\n" +
                "\n" +
                "Enteros (int): representan números enteros sin decimales, como 10, -5, 1000, etc.\n" +
                "Flotantes (float): representan números con decimales, como 3.14, -2.5, 1.0, etc.\n" +
                "Caracteres (char): representan un único carácter, como 'a', 'b', '1', '$', etc.\n" +
                "Estos son solo algunos ejemplos de los tipos de datos básicos en C. También existen otros tipos de datos, como los booleanos (true/false) y las cadenas de caracteres (strings), que son secuencias de caracteres.");

        contenedordatos.add(info5, info6);
        contenedordatos.getStyle().set("background-color", "#dae1f0");
        contenedordatos.setWidth("100%");

        // Operaciones
        VerticalLayout contenedoroperaciones = new VerticalLayout();

        Span info7 = new Span("Operaciones aritméticas y expresiones");
        info7.getStyle().set("font-size", "24px");
        info7.getStyle().set("color", "black");
        info7.getStyle().set("font-weight", "bold");

        Span info8 = new Span("Una vez que hemos declarado y asignado variables, podemos realizar operaciones aritméticas y expresiones utilizando estas variables. En C, tenemos diferentes operadores aritméticos, como la suma (+), resta (-), multiplicación (*), división (/) y módulo (%). Podemos combinar variables y valores constantes en expresiones aritméticas. Por ejemplo:\n "+
                "\n"+
                "int a = 10;\n" +
                "int b = 5;\n" +
                "int resultado = a + b; // resultado es 15\n" +
                "\n" +
                "float c = 3.14;\n" +
                "float d = 2.0;\n" +
                "float resultado2 = c * d; // resultado2 es 6.28\n");

        contenedoroperaciones.add(info7, info8);
        contenedoroperaciones.getStyle().set("background-color", "#dae1f0");
        contenedoroperaciones.setWidth("100%");

        // Operadores de asignacion
        VerticalLayout contenedorasignacion = new VerticalLayout();

        Span info9 = new Span("Operadores de asignación");
        info7.getStyle().set("font-size", "24px");
        info7.getStyle().set("color", "black");
        info7.getStyle().set("font-weight", "bold");

        Span info10 = new Span("Los operadores de asignación se utilizan para asignar un valor a una variable. El operador más común es el signo igual (=). Por ejemplo, podemos asignar el valor 10 a una variable llamada \"x\" de la siguiente manera: x = 10. Otros operadores de asignación incluyen \"+=\", \"-=\", \"*=\", \"/=\", entre otros, que nos permiten realizar operaciones aritméticas y asignar el resultado a una variable.");

        contenedorasignacion.add(info9, info10);
        contenedorasignacion.getStyle().set("background-color", "#dae1f0");
        contenedorasignacion.setWidth("100%");

        //contenedor comparacion
        VerticalLayout contenedorcomparacion = new VerticalLayout();

        Span info11 = new Span("Operadores de comparación");
        info7.getStyle().set("font-size", "24px");
        info7.getStyle().set("color", "black");
        info7.getStyle().set("font-weight", "bold");

        Span info12 = new Span("Los operadores de comparación se utilizan para comparar dos valores y evaluar si una condición es verdadera o falsa. Algunos ejemplos de operadores de comparación son:\n" +
                "\n" +
                "Igualdad (==): evalúa si dos valores son iguales.\n" +
                "Desigualdad (!=): evalúa si dos valores son diferentes.\n" +
                "Mayor que (>), mayor o igual que (>=): evalúan si un valor es mayor o mayor o igual que otro.\n" +
                "Menor que (<), menor o igual que (<=): evalúan si un valor es menor o menor o igual que otro.\n" +
                "El resultado de una comparación es un valor booleano, es decir, verdadero (true) o falso (false).");

        contenedorcomparacion.add(info11, info12);
        contenedorcomparacion.getStyle().set("background-color", "#dae1f0");
        contenedorcomparacion.setWidth("100%");

        //contenedor logico
        VerticalLayout contenedorlogico = new VerticalLayout();

        Span info13 = new Span("Operadores lógicos");
        info7.getStyle().set("font-size", "24px");
        info7.getStyle().set("color", "black");
        info7.getStyle().set("font-weight", "bold");

        Span info14 = new Span("Los operadores lógicos se utilizan para combinar o negar condiciones lógicas. Los operadores lógicos más comunes son:\n" +
                "AND (&&): devuelve verdadero si ambas condiciones son verdaderas.\n" +
                "OR (||): devuelve verdadero si al menos una de las condiciones es verdadera.\n" +
                "NOT (!): niega o invierte el valor de una condición.\n" +
                "Estos operadores nos permiten construir expresiones lógicas más complejas y tomar decisiones basadas en múltiples condiciones.");

        contenedorlogico.add(info13, info14);
        contenedorlogico.getStyle().set("background-color", "#dae1f0");
        contenedorlogico.setWidth("100%");

        Button empezar3 = new Button("Empezar aquí", buttonClickEvent -> {getUI().ifPresent(ui -> {ui.navigate("flujo-c");});});
        Button empezar4 = new Button("Regresar", buttonClickEvent -> {getUI().ifPresent(ui -> {ui.navigate("fundamentos-c");});});

        contenedorContenido.add(contenedorIntroduction,contenedorFund,contenedordatos,contenedoroperaciones,contenedorasignacion,contenedorcomparacion,contenedorlogico);
        contenedorPrincipal.add(contenedorColor,contenedorTittle,contenedorContenido,empezar4, empezar3);
        setContent(contenedorPrincipal);

    }


}