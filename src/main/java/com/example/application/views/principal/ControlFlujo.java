package com.example.application.views.principal;

import pagina.base.PaginaBase;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.html.Span;
import com.vaadin.flow.component.orderedlayout.FlexComponent;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;


@PageTitle("Control de flujo en C")
@Route(value = "flujo-c")
public class ControlFlujo extends PaginaBase{
    public ControlFlujo() {
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
        Span info = new Span("Control de flujo en C");
        info.getStyle().set("color", "black");
        info.getStyle().set("font-weight", "bold");
        info.getStyle().set("font-size", "28px");

        contenedorTittle.add(info);
        contenedorTittle.setAlignItems(FlexComponent.Alignment.CENTER);

        //Contenedor Contenido inicial
        VerticalLayout contenedorIntroduction = new VerticalLayout();
        Span info2 = new Span("¡Bienvenido a la sección de Control de flujo en C! \n"+
                "\n"+
                "El control de flujo en la programación nos permite tomar decisiones y repetir instrucciones según ciertas condiciones. En C, contamos con diferentes estructuras que nos permiten lograr esto. A continuación, te explicaré las sentencias condicionales y los bucles en C.");

        contenedorIntroduction.add(info2);
        contenedorIntroduction.getStyle().set("background-color", "#dae1f0");
        contenedorIntroduction.setWidth("100%");

        //contenedor fundam
        VerticalLayout contenedorFund = new VerticalLayout();

        Span info3 = new Span("Sentencias condicionales:");
        info3.getStyle().set("font-size", "24px");
        info3.getStyle().set("color", "black");
        info3.getStyle().set("font-weight", "bold");

        Span info4 = new Span("La sentencia if: Nos permite ejecutar un bloque de código si se cumple una condición. La estructura básica es:\n"+
                "\n" +
                "if (condición) {\n" +
                "    // Código a ejecutar si se cumple la condición\n" +
                "}\n"+
                "\n" +
                "También podemos agregar la sentencia else para ejecutar un bloque de código alternativo si la condición no se cumple:\n"+
                "\n" +
                "if (condición) {\n" +
                "    // Código a ejecutar si se cumple la condición\n" +
                "} else {\n" +
                "    // Código a ejecutar si no se cumple la condición\n" +
                "}\n"+
                "\n"+
                "La sentencia switch: Nos permite seleccionar entre diferentes opciones en base al valor de una expresión. La estructura básica es:\n"+
                "\n"+
                "switch (expresión) {\n" +
                "    case valor1:\n" +
                "        // Código a ejecutar si la expresión coincide con valor1\n" +
                "        break;\n" +
                "    case valor2:\n" +
                "        // Código a ejecutar si la expresión coincide con valor2\n" +
                "        break;\n" +
                "    // Otros casos...\n" +
                "    default:\n" +
                "        // Código a ejecutar si ninguno de los casos anteriores coincide\n" +
                "        break;\n" +
                "}\n"+
                "\n"+
                "");

        contenedorFund.add(info3, info4);
        contenedorFund.getStyle().set("background-color", "#dae1f0");
        contenedorFund.setWidth("100%");

        // Tipos de datos
        VerticalLayout contenedordatos = new VerticalLayout();

        Span info5 = new Span("Bucles");
        info5.getStyle().set("font-size", "24px");
        info5.getStyle().set("color", "black");
        info5.getStyle().set("font-weight", "bold");

        Span info6 = new Span("El bucle for: Nos permite repetir un bloque de código un número específico de veces. La estructura básica es:\n"+
                "\n"+
                "for (inicialización; condición; incremento/decremento) {\n" +
                "    // Código a repetir\n" +
                "}\n"+
                "\n+"+
                "El bucle while: Nos permite repetir un bloque de código mientras se cumpla una condición. La estructura básica es:\n"+
                "\n"+
                "while (condición) {\n" +
                "    // Código a repetir\n" +
                "}\n"+
                "\n"+
                "El bucle do-while: Es similar al bucle while, pero garantiza que el bloque de código se ejecute al menos una vez antes de verificar la condición. La estructura básica es:\n"+
                "\n"+
                "do {\n" +
                "    // Código a repetir\n" +
                "} while (condición);\n"+
                "\n");

        Button empezar3 = new Button("Finalizar módulo", buttonClickEvent -> {getUI().ifPresent(ui -> {ui.navigate("lenguaje-c");});});

        contenedorContenido.add(contenedorIntroduction,contenedorFund,contenedordatos);
        contenedorPrincipal.add(contenedorColor,contenedorTittle,contenedorContenido);
        setContent(contenedorPrincipal);

    }


}