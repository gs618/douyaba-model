package com.github.douyaba.model;

import lombok.Data;
import lombok.experimental.Accessors;

/**
 *
 * @param <HEAD>
 * @param <BODY>
 * @author sgao
 */
@Data
@Accessors(chain = true)
public class Protocol<HEAD, BODY> {

    private HEAD head;

    private BODY body;

}
