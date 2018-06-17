class Solution:
    def judgeCircle(self, moves):
        return moves.count('R') == moves.count('L') and moves.count('U') == moves.count('D')