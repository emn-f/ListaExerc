package aplicacao;

import entidades.Enumeradas.StatusPedido;
import entidades.Cliente;
import entidades.ItensPedido;
import entidades.Pedido;
import entidades.Produto;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Date;
import java.time.LocalDate;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);

        String nomeCliente, emailCliente, statusPedido, nomeItem;
        Double precoItem;
        int n, quantProduto;
        LocalDate getNasc;
        Date nascimento;

        List<ItensPedido> itens = new ArrayList<>();
        List<Produto> produto = new ArrayList<>();
        List<Cliente> cliente = new ArrayList<>();
        List<Pedido> pedido = new ArrayList<>();

        System.out.println("Informe os dados do cliente:");
        System.out.print("Nome: ");
        nomeCliente = in.nextLine();

        System.out.print("Email: ");
        emailCliente = in.nextLine();

        System.out.print("Data de Nascimento (DD/MM/YYYY): ");
        getNasc = LocalDate.parse(in.nextLine(), DateTimeFormatter.ofPattern("dd/MM/yyyy"));
        nascimento = Date.from(getNasc.atStartOfDay(ZoneId.systemDefault()).toInstant());
        cliente.add(new Cliente(nomeCliente, emailCliente, nascimento));

        System.out.println("Informe os dados do pedido:");
        System.out.print("Status: ");
        statusPedido = in.nextLine();
        System.out.print("Quantos itens para este pedido? ");
        n = in.nextInt();
        in.nextLine();

        for (int i = 0; i < n; i++) {
            
            System.out.println("Informe os dados do item " + (i + 1) + ":");
            System.out.print("Nome do produto: ");
            nomeItem = in.nextLine();
            
            System.out.print("Preço do produto: ");
            precoItem = in.nextDouble();
            in.nextLine();

            System.out.print("Quantidade: ");
            quantProduto = in.nextInt();
            in.nextLine();

            produto.add(new Produto(nomeItem, precoItem));
            itens.add(new ItensPedido(quantProduto, precoItem, produto.get(i)));
        }

        pedido.add(new Pedido(new Date(), StatusPedido.valueOf(statusPedido), itens, cliente.get(0)));
        System.out.println(pedido.toString());
    }
}
