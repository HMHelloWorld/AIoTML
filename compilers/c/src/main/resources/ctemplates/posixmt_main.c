/*****************************************************
 *      THIS IS A GENERATED FILE. DO NOT EDIT.
 *      Implementation for Application /*NAME*/
 *  Generated from AiotML (http://www.aiotml.org)
 *****************************************************/

#include <unistd.h>
#include <stdlib.h>
#include <stdio.h>
#include <ctype.h>
#include <string.h>
#include <math.h>
#include <signal.h>
#include <pthread.h>
#include "aiotml_typedefs.h"
#include "runtime.h"
/*INCLUDES*/

/*C_HEADERS*/

/*CONFIGURATION*/

/*C_GLOBALS*/

void term(int signum)
{
    fflush(stdout);
    fflush(stderr);
    exit(signum);
}


int main(int argc, char *argv[]) {
    struct sigaction action;
    memset(&action, 0, sizeof(struct sigaction));
    action.sa_handler = term;
    sigaction(SIGINT, &action, NULL);
    sigaction(SIGTERM, &action, NULL);

  /*C_MAIN*/
  /*INIT_CODE*/
  /*POLL_CODE*/
}