package com.web;

import com.web.domain.Board;
import com.web.domain.User;
import com.web.domain.enums.BoardType;
import com.web.repository.BoardRepository;
import com.web.repository.UserRepository;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.time.LocalDateTime;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

@RunWith(SpringRunner.class)
@DataJpaTest
public class JpaMappingTest {

    private final String boardTitle = "테스트";
    private final String email = "test@gmail.com";

    @Autowired
    UserRepository userRepository;

    @Autowired
    BoardRepository boardRepository;

    @Before
    public void innt() {
//        User user = boardRepository.save(User.builder()
//        .name("havi")
//        .password("test")
//        .email("email")
//        .createdDate(LocalDateTime.now())
//        .build());

        User user = userRepository.save(User.builder()
                .name("havi")
                .password("test")
                .email(email)
                .createdDate(LocalDateTime.now())
                .build());

        boardRepository.save(Board.builder()
                .title(boardTitle)
                .subTitle("서브타이틀")
                .content("콘텐츠")
                .boardType(BoardType.free)
                .createdDate(LocalDateTime.now())
                .updatedDate(LocalDateTime.now())
                .user(user).build());
    }

    @Test
    public void 제대로_생성됐는지_테스트(){
        User user = userRepository.findByEmail(email);
        assertThat(user.getName(),is("havi"));
        assertThat(user.getPassword(),is("test"));
        assertThat(user.getEmail(),is(email));

        Board board = boardRepository.findByUser(user);
        assertThat(board.getTitle(), is("테스트"));
        assertThat(board.getSubTitle(), is("서브타이틀"));
        assertThat(board.getContent(), is("콘텐츠"));
        assertThat(board.getBoardType(),is(BoardType.free));
    }

}