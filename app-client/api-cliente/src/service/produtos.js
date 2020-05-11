import { http } from './config'

export default {

    // listar produtos
    listar:() => {
        return http.get('produtos')
    },

    // salvar um produto
    salvar:(produto) => {
        return http.post('produto', produto)
    },

    // atualiza registro
    atualizar:(produto) => {
        return http.put('produto', produto)
    },

    // remover registro
    remover:(produto) => {
        return http.delete('produto', {data: produto})
    }
}