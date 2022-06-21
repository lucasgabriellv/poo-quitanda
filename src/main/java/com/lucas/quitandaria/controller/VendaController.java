package com.lucas.quitandaria.controller;

import com.lucas.quitandaria.db.VendaDao;
import com.lucas.quitandaria.mock.VendaMock;
import com.lucas.quitandaria.model.Venda;
import java.util.Date;
import java.util.List;

/*
*@author – Lucasgabriellv
*/
public class VendaController {
    
    //SALVAR
    public static String salvar(Venda venda){
        
        String resposta = null;
        
        //Tenta fazer a insercao
        try{
            //VendaMock.salvar(venda);
            VendaDao.salvar(venda);
        }catch (Exception e){
            e.printStackTrace();
            resposta = "Erro na fonte de dados";
        }
        
        return resposta;
    }
    
    //PROCURAR/LISTAR
    public static List<Venda> procurar(String dataInicio, String dataFim){
        List<Venda> listaResposta = null;
        
        //Tenta fazer a busca dos dados 
        try{
        
            if (dataInicio == null || dataFim == null) {
                //listaResposta = VendaMock.listar();
                listaResposta = VendaDao.listar();
            } else {
                //listaResposta = VendaMock.procurar(dataInicio, dataFim);
                listaResposta = VendaDao.procurar(dataInicio, dataFim);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        return listaResposta;
    }
    
    //OBTER
    public static Venda obterUltima() {
        
        //Instancia venda para retornar no fim da funcao
        Venda venda =  new Venda();
        
        try 
        {
            //tenta obter o venda procurado
            //venda = VendaMock.obterUltima();
            venda = VendaDao.obterUltima();
        } 
        catch (Exception e) 
        {
            //em caso de erro imprime erro 
            //e.printStackTrace();
        }

        return venda;
        
    }
}
