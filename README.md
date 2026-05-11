# 📚 Reserva de Salas de Estudo

Sistema de reserva de salas para campus universitário, desenvolvido em Java com padrões de projeto.

## 👩‍💻 Autoras
- Graziele Sales - Integral
- Ana Clara Ogata - Noturno

## 🧩 Padrões de Projeto Aplicados
- **Factory Method** — criação de diferentes tipos de sala
- **Singleton** — repositório e configuração únicos na memória
- **Strategy** — políticas de detecção de colisão de horários
- **Observer** — notificações automáticas de alterações de reserva
- **Decorator** *(bônus)* — funcionalidades extras nas reservas

## 📋 Requisitos Funcionais
| Código | Descrição |
|--------|-----------|
| RF-01 | Listar salas disponíveis em um intervalo de datas |
| RF-02 | Criar, modificar ou cancelar uma reserva |
| RF-03 | Detectar e impedir colisões de horário |
| RF-04 | Notificar envolvidos quando reserva for alterada/cancelada |
| RF-05 | Relatório diário com reservas confirmadas por sala |

## 🗂️ Estrutura do Projeto
```
room-booking/
├── src/
│   └── com/roombooking/
│       ├── model/          # Entidades do domínio
│       ├── factory/        # Factory Method para tipos de sala
│       ├── strategy/       # Políticas de reserva
│       ├── observer/       # Notificações e relatórios
│       ├── singleton/      # Repositórios e configuração
│       ├── decorator/      # Funcionalidades extras 
│       └── Main.java       # Ponto de entrada
├── docs/
│   └── diagrama-classes.png
└── README.md
```

## ▶️ Como executar
```bash
# Compilar
javac -d out src/com/roombooking/**/*.java src/com/roombooking/Main.java

# Executar
java -cp out com.roombooking.Main
```