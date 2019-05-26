package com.itlike.service.Impl;

import com.itlike.domain.Teacher;
import com.itlike.mapper.TeacherMapper;
import com.itlike.service.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class TeacherServiceImpl implements TeacherService {
    @Autowired
    private TeacherMapper teacherMapper;
    @Override
    public void save(String name) {
        System.out.println("service层------"+name);
        Teacher teacher = new Teacher();
        teacher.setTeacherName(name);
        teacherMapper.insert(teacher);
    }
}
