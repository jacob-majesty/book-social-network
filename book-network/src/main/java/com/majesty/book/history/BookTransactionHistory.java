package com.majesty.book.history;

import com.majesty.book.book.Book;
import com.majesty.book.common.BaseEntity;

import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

@Getter
@Setter
@SuperBuilder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "book_transaction_history")
public class BookTransactionHistory extends BaseEntity {

    @ManyToOne
    @JoinColumn(name = "user_id")
    private String userId;

    @ManyToOne
    @JoinColumn(name = "book_id")
    private Book book;
    private boolean returned;
    private boolean returnApproved;
}
