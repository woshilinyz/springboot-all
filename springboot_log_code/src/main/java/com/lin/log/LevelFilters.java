package com.lin.log;

import ch.qos.logback.classic.Level;
import ch.qos.logback.classic.filter.LevelFilter;

import static ch.qos.logback.core.spi.FilterReply.ACCEPT;
import static ch.qos.logback.core.spi.FilterReply.DENY;

/**
 * @author: Mr.Lin
 * @create: 2019-08-11 15:18:39
 **/
public class LevelFilters {
    /**
     * 通过level设置过滤器
     * @param level
     * @return
     */
    public LevelFilter getLevelFilter(Level level){
        LevelFilter levelFilter = new LevelFilter();
        levelFilter.setLevel(level);
        levelFilter.setOnMatch(ACCEPT);
        levelFilter.setOnMismatch(DENY);
        return levelFilter;
    }
}
