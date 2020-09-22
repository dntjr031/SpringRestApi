package com.rest.api.entity.board;

import com.rest.api.entity.common.CommonDateEntity;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;

@Builder
@Entity
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Board extends CommonDateEntity implements Serializable {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long boardId;
    @Column(nullable = false, length = 100)
    private String name;
}
